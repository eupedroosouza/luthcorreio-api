# LuthCorreioAPI
[![](https://jitpack.io/v/eupedroosouza/luthcorreio-api.svg)](https://jitpack.io/#eupedroosouza/luthcorreio-api)

# Maven
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```
```xml
<dependency>
    <groupId>com.github.eupedroosouza</groupId>
    <artifactId>luthcorreio-api</artifactId>
    <version>VERSION</version>
    <scope>provided</scope>
</dependency>
```
Pegue a última versão em https://github.com/eupedroosouza/luthcorreio-api/releases.

# API

#### Pegando a instância da API e o manipulador do jogador.
```java
// Get the API instance
MailAPI mailAPI = new MailAPI();
				
// Pick up the player's handle.
MailPlayer mailPlayer = mailAPI.getMailPlayer(player);			
```

#### Pegando item do jogador
```java
// Getting the item with the id.
mailPlayer.getItem(id);
```

#### Adicionando item ao jogador.
```java
// ItemStack to add.
ItemStack stack = new ItemStack(Material.DIAMOND);
				
// Adding item with ItemStack.
mailPlayer.addItem(stack);
				
// Adding item with ItemStack and sender.
mailPlayer.addItem(stack, "Mandando por CONSOLE");
				
// Adding item with ItemStack and expiry time (in milliseconds).
mailPlayer.addItem(stack, TimeUnit.SECONDS.toMillis(20));
				
// Adding item with ItemStack, sender and expiry time (in milliseconds).
mailPlayer.addItem(stack, "Mandando por CONSOLE", TimeUnit.SECONDS.toMillis(20));
```

#### Removendo item do jogador.
```java
// Removing with Item id.
mailPlayer.removeItem(id);
				
// Removing with net.luthcraft.mail.api.Item.
mailPlayer.removeItem(item);
```


#### Bloqueando e desbloqueando presentes.
```java
// Blocking gifts.
mailPlayer.block();
				
// Unlocking the presents.
mailPlayer.unblock();
				
// Checking if gifts are locked.
mailPlayer.isBlock();
```

# Informações do desenvolvedor
Plugins feitos pelo Pedro(ou PedroCodes)

Discord: PedroCodes#3943<br>
Email: mypedrosouza@gmail.com<br>
GIT: eupedroosouza(https://github.com/eupedroosouza)
