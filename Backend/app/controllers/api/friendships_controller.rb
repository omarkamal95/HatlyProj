class Api::FriendshipsController < Api::BaseController

  def follow
    user_id = params[:id]
    friend_id = params[:friend_id]

    @following = Friendship.new(user_id: user_id, friend_id: friend_id)

    if @following.save
      render json: @following, status: :created
    else
      render nothing: true, status: :bad_request
    end
  end

  def followList
    user_id = params[:id]
    @followers = Friendship.where(user: user_id).to_json(:include => :friend)
    respond_with @followers
  end
end
