class Post < ActiveRecord::Base
	has_many :comments
	has_many :items
	belongs_to :user
	has_one :wall_post

	validates :text, :presence => true

	scope :recent_posts, -> { where("created_at <= ?", (Time.zone.now - 24.hours).to_s(:db)) }
end
