function ProductDetailQuantity({ product }) {
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
