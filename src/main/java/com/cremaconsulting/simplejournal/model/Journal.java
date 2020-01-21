package com.cremaconsulting.simplejournal.model;

import java.util.List;

/**
 * message: 'Journal for ' + new Date().toLocaleDateString(),
 *     quote: 'I wish I had a list of cool quotes',
 *     challengeSituation: 'Situation!',
 *     challengeAction: 'Action!',
 *     challengeResult: 'Result??',
 *     tomorrowInput: 'Pick up my book I read Boukowski',
 *     tomorrows: [
 *       'On the porch cos I lost my house key'
 *     ],
 *     notes: [
 *       'Met Tim today who works on Fulcrum team',
 *     ],
 *     noteInput: 'Add a new note...',
 *     goals: [
 *       {
 *         text: 'Squish is simply the most brilliant and thoughtful human ever.'
 *       },
 *       {
 *         text: 'ferrets'
 *       }
 *       ,
 *       {
 *         text: 'cats'
 *       }
 *     ]
 */
public class Journal {
    public String message;
    public List<String> tomorrows;
    public List<String> notes;
    public List<Goal> goals;
    public List<Challenge> challenges;

    public Journal(String message, List<String> tomorrows, List<String> notes, List<Goal> goals, List<Challenge> challenges) {
        this.message = message;
        this.tomorrows = tomorrows;
        this.notes = notes;
        this.goals = goals;
        this.challenges = challenges;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getTomorrows() {
        return tomorrows;
    }

    public void setTomorrows(List<String> tomorrows) {
        this.tomorrows = tomorrows;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    public List<Challenge> getChallenges() {
        return challenges;
    }

    public void setChallenges(List<Challenge> challenges) {
        this.challenges = challenges;
    }
}
