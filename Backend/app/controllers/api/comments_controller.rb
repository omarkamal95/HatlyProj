class Api::CommentsController < Api::BaseController

  def create
    @comment = Comment.new(text: params[:text], post_id: params[:post_id], user_id: params[:user_id])
      if @comment.save
          render json: @comment, status: :created
      else
        render nothing: true, status: :bad_request
      end
  end

  def index
    @post = Post.find(params[:post_id])
    @comments = @post.comments.to_json(:include => [:user])
    respond_with @comments
  end

end
