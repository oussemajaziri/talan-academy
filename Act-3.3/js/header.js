document.onscroll = (event) => {
  if (window.pageYOffset > 59) {
    document.querySelector("header").classList.add("fixed-header");
    document.querySelector(".search-bar").classList.add("d-none");
    document.querySelector(".search-bar-scroll").classList.add("search-bar-scroll-active");

  } else {
    document.querySelector("header").classList.remove("fixed-header");
    document.querySelector(".search-bar").classList.remove("d-none");
    document.querySelector(".search-bar-scroll").classList.remove("search-bar-scroll-active");
  }
}
 
