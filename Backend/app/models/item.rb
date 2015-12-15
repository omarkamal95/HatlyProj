class Item < ActiveRecord::Base
	belongs_to :post
	before_create :normalize_name

	attr_accessor :type_of_item

	protected
    def normalize_name
      self.name = self.name.downcase.titleize
    end
end
