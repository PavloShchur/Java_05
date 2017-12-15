package javaCollections;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProductCatalogueTest {

	@Test
	public void shouldOnlyHoldUniqueProducts() throws Exception {
		ProductCatalogue catalogue = new ProductCatalogue();

		catalogue.isSuppliedBy(ProductFixtures.bobs);
		catalogue.isSuppliedBy(ProductFixtures.kates);

		assertThat(catalogue,
				containsInAnyOrder(ProductFixtures.door, ProductFixtures.floorPanel, ProductFixtures.window));
	}

	@Test
	public void treeShouldOnlyHoldUniqueProducts() throws Exception {
		TreeProductCatalogue catalogue = new TreeProductCatalogue();

		catalogue.isSuppliedBy(ProductFixtures.bobs);
		catalogue.isSuppliedBy(ProductFixtures.kates);

		assertThat(catalogue,
				containsInAnyOrder(ProductFixtures.door, ProductFixtures.floorPanel, ProductFixtures.window));
	}

	@Test
	public void shouldFindLightVanProducts() throws Exception {
		TreeProductCatalogue catalogue = new TreeProductCatalogue();

		catalogue.isSuppliedBy(ProductFixtures.bobs);
		catalogue.isSuppliedBy(ProductFixtures.kates);

		assertThat(catalogue.lightVanProducts(), containsInAnyOrder(ProductFixtures.window));
	}

	@Test
	public void shouldFindHeavyVanProducts() throws Exception {
		TreeProductCatalogue catalogue = new TreeProductCatalogue();

		catalogue.isSuppliedBy(ProductFixtures.bobs);
		catalogue.isSuppliedBy(ProductFixtures.kates);

		assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(ProductFixtures.door, ProductFixtures.floorPanel));
	}
}
