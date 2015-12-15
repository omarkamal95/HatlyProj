class CreatePosts < ActiveRecord::Migration
  def change
    create_table :posts do |t|
      t.integer :type, null: false
      t.text :text,	null: false
      t.string :location, null: false
      t.references :user, index: true, foreign_key: true
      t.timestamps null: false
    end
  end
end
