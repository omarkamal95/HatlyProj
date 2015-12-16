class User < ActiveRecord::Base
#  Virtual Attributes
  has_secure_password

#  Relations
  has_many :comments
  has_many :friendships, :foreign_key => "user",
  :class_name => "Friendship"
  has_many :friends, :through => :friendships
  has_many :posts
  has_many :wall_posts

#  Validations
  validates :email, email_format: { message: "Isn't in Email format" }
  validates :password, :length => {:within => 6..40}
  validates :first_name, :last_name, :date_of_birth, :presence => true
end
