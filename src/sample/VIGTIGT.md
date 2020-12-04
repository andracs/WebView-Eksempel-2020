Du skal huske at udvide din run configuration med følgende mærkelighed:

```
--module-path /Users/andrasacs/IdeaProjects/_external_libraries/javafx-sdk-11.0.2/lib 
--add-exports javafx.graphics/com.sun.javafx.sg.prism=ALL-UNNAMED 
--add-modules=javafx.swing,javafx.graphics,javafx.fxml,javafx.media,javafx.web 
--add-reads javafx.graphics=ALL-UNNAMED 
--add-opens javafx.controls/com.sun.javafx.charts=ALL-UNNAMED 
--add-opens javafx.graphics/com.sun.javafx.iio=ALL-UNNAMED 
--add-opens javafx.graphics/com.sun.javafx.iio.common=ALL-UNNAMED 
--add-opens javafx.graphics/com.sun.javafx.css=ALL-UNNAMED 
--add-opens javafx.base/com.sun.javafx.runtime=ALL-UNNAMED
```

OBS: Første linje skal erstattes med din path til JavaFX