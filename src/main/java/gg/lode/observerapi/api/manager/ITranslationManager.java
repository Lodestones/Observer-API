package gg.lode.observerapi.api.manager;

import gg.lode.bookshelfapi.api.util.VariableContext;
import gg.lode.observerapi.api.data.Translation;

public interface ITranslationManager {
    Translation translate(String path);

    Translation translate(String path, VariableContext context);
}
