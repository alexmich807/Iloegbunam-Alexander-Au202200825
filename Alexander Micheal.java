public class Main {```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Art Portfolio</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>My Art Portfolio</h1>
    </header>
    <main>
        <div class="gallery">
            <div class="art-piece">
                <img src="art1.jpg" alt="Art 1">
                <div class="overlay">
                    <div class="text">Art 1 Description</div>
                </div>
            </div>
            <!-- Repeat for more art pieces -->
        </div>
    </main>
    <div id="lightbox" class="lightbox">
        <span class="close">&times;</span>
        <img class="lightbox-content" id="lightbox-img">
        <div id="caption"></div>
    </div>
    <script src="scripts.js"></script>
</body>
</html>
```

### CSS Styling
Next, let's create the CSS for the responsive grid layout, hover effects, and lightbox effect:

```css
/* styles.css */
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

header {
    text-align: center;
    padding: 20px;
    background-color: #333;
    color: #fff;
}

.gallery {
    display: grid;
    grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
    gap: 10px;
    padding: 10px;
}

.art-piece {
    position: relative;
}

.art-piece img {
    width: 100%;
    height: auto;
    display: block;
}

.overlay {
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    height: 100%;
    width: 100%;
    opacity: 0;
    transition: .5s ease;
    background-color: rgba(0, 0, 0, 0.5);
}

.art-piece:hover .overlay {
    opacity: 1;
}

.text {
    color: white;
    font-size: 20px;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    text-align: center;
}

.lightbox {
    display: none;
    position: fixed;
    z-index: 1;
    padding-top: 60px;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    overflow: auto;
    background-color: rgba(0, 0, 0, 0.9);
}

.lightbox-content {
    margin: auto;
    display: block;
    width: 80%;
    max-width: 700px;
}

.close {
    position: absolute;
    top: 15px;
    right: 35px;
    color: #fff;
    font-size: 40px;
    font-weight: bold;
    transition: 0.3s;
}

.close:hover,
.close:focus {
    color: #bbb;
    text-decoration: none;
    cursor: pointer;
}

#caption {
    margin: auto;
    display: block;
    width: 80%;
    max-width: 700px;
    text-align: center;
    color: #ccc;
    padding: 10px 0;
}
```

### JavaScript for Lightbox
Finally, let's add the JavaScript for the lightbox functionality:

```javascript
/* scripts.js */
document.addEventListener('DOMContentLoaded', function() {
    const lightbox = document.getElementById('lightbox');
    const lightboxImg = document.getElementById('lightbox-img');
    const captionText = document.getElementById('caption');
    const closeBtn = document.querySelector('.close');
    
    document.querySelectorAll('.art-piece img').forEach(img => {
        img.addEventListener('click', function() {
            lightbox.style.display = 'block';
            lightboxImg.src = this.src;
            captionText.innerHTML = this.alt;
        });
    });

    closeBtn.addEventListener('click', function() {
        lightbox.style.display = 'none';
    });

    lightbox.addEventListener('click', function(event) {
        if (event.target === lightbox) {
            lightbox.style.display = 'none';
        }
    });
});
```

### Putting it All Together
1. Save
    public static void main(String[] args){
    //start coding
    }
}
