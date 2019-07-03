package edu.tamu.scholars.middleware.discovery.serializer;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;

import edu.tamu.scholars.middleware.discovery.model.Collection;

@JsonComponent
public class CollectionSerializer extends AbstractSolrDocumentSerializer<Collection> {

    private static final long serialVersionUID = -6696726318107162766L;

    private final JsonSerializer<Collection> delegate = new UnwrappingCollectionSerializer(NameTransformer.NOP);

    public CollectionSerializer() {
        super(Collection.class);
    }

    @Override
    protected JsonSerializer<Collection> getDelegate() {
        return delegate;
    }

    @Override
    public JsonSerializer<Collection> unwrappingSerializer(final NameTransformer nameTransformer) {
        return new UnwrappingCollectionSerializer(nameTransformer);
    }

}
