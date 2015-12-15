class Api::PostsController < Api::BaseController


  def index

    @posts = Post.recent_posts.to_json(:include => [:user, :comments])
    respond_with @posts
  end

  def show
    @post = Post.find(params[:id]).to_json(:include => [:user, :comments])
    respond_with @post
  end

  def create
    @posts = Post.new(text: params[:text], post_type: params[:post_type], user_id: params[:user_id], location: params[:location])

    respond_with @posts
  end


end
