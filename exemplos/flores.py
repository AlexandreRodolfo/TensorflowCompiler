from tensorflow import keras
from tensorflow.keras import layers
from tensorflow.keras.models import Sequential

img_flores = Sequential([
    layers.Input(shape=(180,180,3)),
    layers.Rescaling(1/255, offset=0),
    layers.Conv2D(16, (3,3)),
    layers.Activation("relu"),
    layers.MaxPooling2D((1,1)),
    layers.Conv2D(32, (3,3)),
    layers.Activation("relu"),
    layers.MaxPooling2D((1,1)),
    layers.Conv2D(64, (3,3)),
    layers.Activation("relu"),
    layers.MaxPooling2D((1,1)),
    layers.Flatten(),
    layers.Dense((128)),
    layers.Activation("relu"),
    layers.Dense((5))
])
