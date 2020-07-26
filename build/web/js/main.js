(function($) {
    "use strict";

    $(document).ready(function() {
        $.fn.scrollView = function() {
            return this.each(function() {
                $('html, body').animate({
                    scrollTop: $(this).offset().top
                }, 1000);
            });
        }
    });

    $('.slide').prepend('<div class="patternOverlay"></div>');

    $('button.navbar-toggle').on("click", function() {
        $(this).toggleClass('active');
        $('.navbar-collapse').slideToggle();
    });


    $('.navbar-collapse li a').on("click", function() {
        $('.navbar-collapse.collapse').removeClass('active');
        $('button.navbar-toggle').removeClass('active');
    });


    $(".menuItem").on({
        mouseenter: function() {
            $(this).addClass('active');
        },
        mouseleave: function() {
            $(this).removeClass('active');
        }
    });


    if ($(window).width() < 1000) {
        $('.navbar-nav li a').on("click", function() {
            $('.navbar-collapse.collapse').removeClass('in');
        });
    }

    $('#navigation a, .smooth, a[href^="#theCouple"]').on("click", function() {
        if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') && location.hostname == this.hostname) {
            var target = $(this.hash);
            target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
            if (target.length) {
                $('html,body').animate({
                    scrollTop: target.offset().top
                }, 1000);
                return false;
            }
        }
    });
}(jQuery));