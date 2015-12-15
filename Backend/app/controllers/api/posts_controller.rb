class Api::PostsController < Api::BaseController


  def index

    @posts = Post.recent_posts.to_json(:include => [:user, :comments])
    respond_with @posts
  end

  def show
    @post = Post.find(params[:id]).to_json(:include => [:user, :comments])
    if @post
      respond_with @post
    else
      render nothing: true, status: :bad_request
    end
  end

  def create
    @post = Post.new(text: params[:text], post_type: params[:post_type], user_id: params[:user_id], location: params[:location])
      if @post.save
          render json: @post, status: :created
      else
        render nothing: true, status: :bad_request
      end
  end

  def destroy
    @post = Post.find(params[:id])
    if @post.destroy
      render json: @post, status: :deleted
    else
      render nothing: true, status: :bad_request
    end
  end


end
