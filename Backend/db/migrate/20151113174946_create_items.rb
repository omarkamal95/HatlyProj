class CreateItems < ActiveRecord::Migration
  def change
    create_table :items do |t|
      t.float :price
      t.string :name
      t.references :post, index: true, foreign_key: true
      t.timestamps null: false
    end
  end
end
