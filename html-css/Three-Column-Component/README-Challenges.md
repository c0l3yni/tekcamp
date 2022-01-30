README 

includes:
this README
index.html
SimpleCSS.css
Files provided by TEKsystems(images, examples, and style-guide)

Homework - HTML-CSS Three Column Component

I had difficulty with starting on the html before starting css. I was unsure of the id's and class's I wanted to use in my css so I found myself stuck hypothesizing what I might do. Once that was decided I struggled to decide <div> or no <div> as well as <button> or <a> and <img> or <embed>. 

After those decisions were made I had trouble deciding whether to include an animation for the button function. I chose to do the animation because it was included in lecture. I also chose to do it becauase the functionality was shown to us in UDEMY. I felt those were sufficient cause to demonstrate skills I learned from the resources provided. I had trouble deciding the timing because if a button doesnt change quickly enough then users will most likely assume it is broken. The button ultimately gave me a lot of questions because it forced me to rethink my CSS. I changed my classes to id's with a main class called .button. This allowed me to shorten my code by 30ish lines. I did the same for .box and #box-1, 2, and 3. Which again shortened my code by 30ish lines. 

The actual code for the animation was found in the UDEMY course under Section 9 number 72. I also found that by typing logical words for the things I want my stuff to do-- I was able to make like the cursor change upon hovering. 

The next hard thing was media queries. So first I checked both of the image's sizes by right clicking and going to resize. The first one was 375x1502 and the desktop was 1440x800. I started with one media query for 700 to shift from rows to columns. This severely messed up my buttons so I dragged my website from mobile to desktop size and noticed at 700 and 1000 is where my webisite "broke." That's how I came up with 2 media queries. Now the website works from 320 width up to 1500+ width. 

I used a big flexbox that holds all of my boxes instead of using flex inside box-1, box-2, and box-3 because as the stuff moves from row-column I didn't expect a big shift in the necessary padding inside each colored box. This is probably one of my bigger regrets of this project because hypothetically I could have done 3 flex-containers inside one container which would have made the site more responsive rather than fixing the unresponsive parts in media queries. 

One last challenge was I took attention to detail to mean taking multiple screenshots of my website displayed at mobile size against the picture provided (changed to be the same size) and used a digital ruler to check my padding, margins, line height, word spacing and any other ways that would be noticeably different. 

I think the button animation reflects the tools in the lessons that were given to us and the resizing of the website utilizing 2 media queries majorly benefitted the functionality of the website for tablet users. 

Also opacity... made me question everything's color. 

Something I did want to mention is the way I have formatted the CSS file was for easier readability for myself. However, I understand it is not the typical format for CSS files. 

Overall, this assignment excited me and helped me better understand flexbox, css, and even mediaqueries (which baffled me for 4 days). 