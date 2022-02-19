function ProductDetailCategory({ product }) {
  return (
    <section>
      <p className="category">
        <strong>Category:</strong> <i>{product.category}</i>
      </p>
    </section>
  );
}
export default ProductDetailCategory;
