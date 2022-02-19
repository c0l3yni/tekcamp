function ProductDetailManufacturer({ product }) {
  return (
    <div>
      <section>
        <p>
          <strong>Manufactured by:</strong> {product.manufacturer}
        </p>
      </section>
    </div>
  );
}
export default ProductDetailManufacturer;
