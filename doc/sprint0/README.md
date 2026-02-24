
### Objective

 Rumi (Reflect, Understand, Maintain & Improve) is a gentle habit tracker designed to support users in **reflecting** on their habits, **understanding** patterns, **maintaining** positive mental health, and **improving** overall habits without guilt or pressure. Many productivity apps focus on streaks, competition, or punishment for failure. For procrastinators and overwhelmed users, this could make them feel guilty and discouraged.


### Motivation
This project was built to:
- Help users build sustainable habits without anxiety
- Encourage reflection and mood awareness
- Reward gentle consistency over perfection or completion 
- Create a supportive community through buddy accountability

Core Focus: breaking the procrastination cycle through gentle daily affirmative messages, habit tracking and small wins.


### Core Features(MVP):
- User Authentication - Provides a secure sign-up and log-in with encrypted and authenticated passwords.
- Habit tracking dashboard
   - Edit and delete tasks/habits
   - Daily completion tracking
   - Daily check-ins, mood sliders, quick reflections, message
- Gentle reminders
- Analytics - charts, streaks, mood and progress without judgement

### Extended Features
- Journaling page - A space for personal thoughts and reflections
- Virtual Pet - (rewards when tasks are completed or when they complete their focus time)
- Rewards system (earn coins to: designing your virtual pet, unlocking new themes, showing up any 3 times a week, 5 mood logs, having journal entries and daily badges)
- Shop - for users to buy items with their rewards
- Buddy list - connection with other users for mutual motivation


### Architecture
The app follows the Model View Controller (MVC) structure:
- Model: Handles user data, habits, and mood logs
- View: Provides user interface: Dashboard, Analytics, Journal, Buddies
- Controller: Coordinates between model and view, manages authentication and reminders


### Key Users

- Students – manage study habits without burnout  
- Working Professionals – balance productivity and wellness  
- Remote Workers – structure daily routines with gentle support  
- Self-care Users – track emotional patterns and reflections  
- Wellness Enthusiasts – cultivate healthy, mindful living  



### Example Use Scenarios

- Sarah (Busy Parent): Logs short self-care habits and receives kind reminders that missing days is okay.  
- Avantika (Remote Worker): Tracks focus sessions and reflections to separate work and rest time.  
- Edmond (Goal-Oriented Student): Earns virtual rewards for completing small habits and checks his progress charts weekly.

### Installation

Coding languages and frameworks:
- Java JDK 17 or newer
- Apache Maven 3.8
- Git
- Database: MySQL or MongoDB 

How to install: 
- Make sure you have the above installed
- Clone the repository then navigate to the CommitMates directory
  
**Backend**

- Navigate to the backend directory using cd
- Use mvn clean install
- Run the server with mvn spring-boot:run

**Frontend**

- Navigate to the frontend directory using cd
- Use mvn clean install
- Use mvn javafx:run

In your browser, visit localhost:8080

### Contribution
- So far we used a very simple git flow to manage our branches. The main branch is the code that is ready for production, and we created a separate setup branch specifically for uploading the setup, to avoid ruining anything in the main branch. For future sprints we will have separate branches for features and development.
- We name our branches on the type of work that is being done (e.g. setup, feature1, feature2, develop).
- We use Github Issues to track bugs and what needs to be fixed.
- If we need to upload a markdown or a file, those are uploaded directly to the main branch, we do not use pull requests. However, all our code changes are submitted via pull requests and at least one other group member must review before it is merged with the main branch. 
