from tensorflow import keras
from tensorflow.keras import layers
from tensorflow.keras.models import Sequential

analisa_emocao = Sequential([
    layers.Input(shape=(48,48,1)),
    layers.Rescaling(1/255, offset=0),
    layers.Conv2D(128, (3,3)),
    layers.Activation("relu"),
    layers.MaxPooling2D((2,2)),
    layers.Dropout(0.4),
    layers.Conv2D(256, (3,3)),
    layers.Activation("relu"),
    layers.MaxPooling2D((2,2)),
    layers.Dropout(0.4),
    layers.Conv2D(512, (3,3)),
    layers.Activation("relu"),
    layers.MaxPooling2D((2,2)),
    layers.Dropout(0.4),
    layers.Conv2D(512, (3,3)),
    layers.Activation("relu"),
    layers.MaxPooling2D((2,2)),
    layers.Dropout(0.4),
    layers.Flatten(),
    layers.Dense((512)),
    layers.Activation("relu"),
    layers.Dropout(0.4),
    layers.Dense((256)),
    layers.Activation("relu"),
    layers.Dropout(0.4),
    layers.Dense((7)),
    layers.Activation("softmax")
])
