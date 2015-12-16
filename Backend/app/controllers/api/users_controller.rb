class Api::UsersController < Api::BaseController
  def index

    @users = User.all
    respond_with @users
  end

  def show
    @user = User.find(params[:id])
    if @user
      respond_with @user
    else
      render nothing: true, status: :bad_request
    end
  end

  def create
    @user = User.new(first_name: params[:first_name], last_name: params[:last_name], date_of_birth: params[:date_of_birth],
    email: params[:email], password: params[:password], city: params[:city],
    country: params[:country], image: params[:image])
      if @user.save
          render json: @user, status: :created
      else
        render nothing: true, status: :bad_request
      end
  end

end
