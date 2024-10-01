package br.com.fiap.mp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/music")
public class MusicController {
    @GetMapping
    public String letra(Model model){
        model.addAttribute("musica","She knows\n" +
                "She knows (ayy)\n" +
                "(Bad things happen to the people you love)\n" +
                "(And you find yourself praying up to heaven above)\n" +
                "(But honestly, I've never had much sympathy)\n" +
                "('Cause those bad things, I always saw them coming for me)\n" +
                "(I'm gonna run, run away) oh, I (run, run away, run away), oh, I-I-I\n" +
                "(Run away and never come back) well, alright\n" +
                "(I'm gonna run, run away) oh, I (run, run away, run away), oh, I-I-I\n" +
                "(Show 'em that your color is black) well, alright\n" +
                "\n" +
                "Damned if I do, damned if I don't\n" +
                "You know I got a girl back home\n" +
                "You got a man, what you want, what you want?\n" +
                "What these bitches want from a nigga?\n" +
                "On some DMX shit, huh\n" +
                "I know them other niggas love tricking\n" +
                "On some BMX shit, but not me\n" +
                "Now I'm sure you done heard about me\n" +
                "A black star, Mos Def, Kweli\n" +
                "Good so them bad hoes try me, they try me\n" +
                "This is Martin Luther King in the club, getting dubs\n" +
                "With a bad bitch in his ear, sayin' that she down for whatever\n" +
                "In the back of his mind is Coretta\n" +
                "\n" +
                "And she knows, she knows (bad things happen to the people you love)\n" +
                "And I know she knows, and I know she knows (and you find yourself praying up to heaven above)\n" +
                "Deep down, she knows, she knows (but honestly, I've never had much sympathy)\n" +
                "And I know she knows, and I know she knows ('cause those bad things, I always saw them coming for me)\n" +
                "\n" +
                "Well, alright (I'm gonna run, run away), oh, I (run, run away, run away), oh, I-I-I\n" +
                "(Run away and never come back) I can't be what you want from me, well, alright\n" +
                "(I'm gonna run, run away), oh, I (run, run away, run away), oh, I-I-I\n" +
                "(Run away and never come back) I can't be what you want from me, well, alright\n" +
                "\n" +
                "Damned if I do (shit), damned if I don't\n" +
                "I'm passing up on bad hoes\n" +
                "Trying to be the man that she want, what she want?\n" +
                "What she, what she want from a nigga?\n" +
                "To put a ring on it\n" +
                "Got a bitch on my dick right now\n" +
                "And she just want to sing on it\n" +
                "Got me up so high, tryna get a piece of that apple pie\n" +
                "I be up so high, tryna get a piece of that apple pie\n" +
                "Dancehall vibe with my pants on fire\n" +
                "'Cause I told her I was asleep\n" +
                "'Cause I creep with this pretty young thing that I chose\n" +
                "And she could be doing the same thing, I suppose\n" +
                "\n" +
                "And she knows, she knows (bad things happen to the people you love)\n" +
                "And I know she knows, and I know she knows (and you find yourself praying up to heaven above)\n" +
                "Deep down, she knows, she knows (but honestly, I've never had much sympathy)\n" +
                "And I know she knows, and I know she knows ('cause those bad things, I always saw them coming for me)\n" +
                "\n" +
                "Well, alright (I'm gonna run, run away), oh, I (run, run away, run away), oh, I-I-I\n" +
                "(Run away and never come back) I can't be what you want from me, well, alright\n" +
                "(I'm gonna run, run away), oh, I (run, run away, run away), oh, I-I-I\n" +
                "(Run away and never come back) I can't be what you want from me, well, alright\n" +
                "\n" +
                "Niggas say: Turn up, hoes say: Turn up\n" +
                "Only bad thing 'bout a star is they burn up\n" +
                "Niggas say: Turn up, hoes say: Turn up\n" +
                "Only bad thing 'bout a star is they burn up\n" +
                "Rest in peace to Aaliyah\n" +
                "Rest in peace to Left Eye (Left Eye)\n" +
                "Michael Jackson, I'll see ya\n" +
                "Just as soon as I die (I die)\n" +
                "\n" +
                "Got me up so high, tryna get a piece of that apple pie, uh\n" +
                "I be up so high, tryna get a piece of that apple pie\n" +
                "Got me up so high, tryna get a piece of that apple pie\n" +
                "I be up so high, tryna get a piece of that apple pie\n" +
                "Got me up so high, tryna get a piece of that apple pie, uh\n" +
                "I be up so high, tryna get a piece of that apple\n" +
                "\n" +
                "Well, alright (I'm gonna run, run away), oh, I (run, run away, run away), oh, I-I-I\n" +
                "(Run away and never come back) I can't be what you want from me, well, alright\n" +
                "(I'm gonna run, run away), oh, I (run, run away, run away), oh, I-I-I\n" +
                "(Run away and never come back) I can't be what you want from me, well, alright\n" +
                "(I'm gonna run, run away), oh, I (run, run away, run away), oh, I-I-I\n" +
                "(Run away and never come back) I can't be what you want from me, well, alright\n" +
                "\n" +
                "(Run away, run away—, back) (ooh, ooh)\n" +
                "(Run away, run away—, back) (ooh, ooh)\n" +
                "(Run away, run away—, back) (ooh, ooh)\n" +
                "(Run away, run away—, back) (ooh, ooh)");
        return "music";
    }
}
