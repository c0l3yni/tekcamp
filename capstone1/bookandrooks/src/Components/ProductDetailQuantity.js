
function ProductDetailQuantity({ product, cart, addToCart }) {

  return (
    <div>
      <section>
        <p>
          <strong>Quantity In Stock:</strong> {product.quantity}
        </p>
      </section>
    </div>
  );
}
export default ProductDetailQuantity;
