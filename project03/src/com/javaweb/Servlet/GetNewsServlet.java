package com.javaweb.Servlet;

import com.javaweb.DB.DBConnection;
import com.javaweb.news.NewsLink;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "GetNewsServlet", value = "/GetNewsServlet")
public class GetNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String category = request.getParameter("category");
        if (category.equals("娱乐新闻")) {
            NewsLink news1 = new NewsLink();
            NewsLink news2 = new NewsLink();
            NewsLink news3 = new NewsLink();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            Connection connection = null;
            //娱乐1
            try {
                connection = DBConnection.getConnection();
                String sql = "SELECT title, content, author,created_at FROM news where id=1";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery(sql);
                while (resultSet.next()) {
                    news1.setTitle(resultSet.getString("title"));
                    news1.setContent(resultSet.getString("content"));
                    news1.setAuthor(resultSet.getString("author"));
                    news1.setCreated_at(resultSet.getString("created_at"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            //娱乐2
            try {
                connection = DBConnection.getConnection();
                String sql = "SELECT title, content, author,created_at FROM news where id=2";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery(sql);
                while (resultSet.next()) {
                    news2.setTitle(resultSet.getString("title"));
                    news2.setContent(resultSet.getString("content"));
                    news2.setAuthor(resultSet.getString("author"));
                    news2.setCreated_at(resultSet.getString("created_at"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            //娱乐3
            try {
                connection = DBConnection.getConnection();
                String sql = "SELECT title, content, author,created_at FROM news where id=7";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery(sql);
                while (resultSet.next()) {
                    news3.setTitle(resultSet.getString("title"));
                    news3.setContent(resultSet.getString("content"));
                    news3.setAuthor(resultSet.getString("author"));
                    news3.setCreated_at(resultSet.getString("created_at"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            request.setAttribute("data1",news1.getTitle());
            request.setAttribute("data2",news1.getAuthor());
            request.setAttribute("data3",news1.getCreated_at());
            request.setAttribute("data4",news1.getContent());

            request.setAttribute("dataA",news2.getTitle());
            request.setAttribute("dataB",news2.getAuthor());
            request.setAttribute("dataC",news2.getCreated_at());
            request.setAttribute("dataD",news2.getContent());

            request.setAttribute("dataQ",news3.getTitle());
            request.setAttribute("dataW",news3.getAuthor());
            request.setAttribute("dataE",news3.getCreated_at());
            request.setAttribute("dataR",news3.getContent());
            RequestDispatcher dispatcher1 = request.getRequestDispatcher("Entertainment.jsp");
            dispatcher1.forward(request, response);

        }
        if (category.equals("体育新闻")) {
            NewsLink sportnews1 = new NewsLink();
            NewsLink sportnews2 = new NewsLink();
            NewsLink sportnews3 = new NewsLink();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            Connection connection = null;
            //体育1
            try {
                connection = DBConnection.getConnection();
                String sql = "SELECT title, content, author,created_at FROM news where id=5";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery(sql);
                while (resultSet.next()) {
                    sportnews1.setTitle(resultSet.getString("title"));
                    sportnews1.setContent(resultSet.getString("content"));
                    sportnews1.setAuthor(resultSet.getString("author"));
                    sportnews1.setCreated_at(resultSet.getString("created_at"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }


            //体育2
            try {
                connection = DBConnection.getConnection();
                String sql = "SELECT title, content, author,created_at FROM news where id=6";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery(sql);
                while (resultSet.next()) {
                    sportnews2.setTitle(resultSet.getString("title"));
                    sportnews2.setContent(resultSet.getString("content"));
                    sportnews2.setAuthor(resultSet.getString("author"));
                    sportnews2.setCreated_at(resultSet.getString("created_at"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            //体育3
            try {
                connection = DBConnection.getConnection();
                String sql = "SELECT title, content, author,created_at FROM news where id=8";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery(sql);
                while (resultSet.next()) {
                    sportnews3.setTitle(resultSet.getString("title"));
                    sportnews3.setContent(resultSet.getString("content"));
                    sportnews3.setAuthor(resultSet.getString("author"));
                    sportnews3.setCreated_at(resultSet.getString("created_at"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }



            request.setAttribute("data1",sportnews1.getTitle());
            request.setAttribute("data2",sportnews1.getAuthor());
            request.setAttribute("data3",sportnews1.getCreated_at());
            request.setAttribute("data4",sportnews1.getContent());

            request.setAttribute("dataA",sportnews2.getTitle());
            request.setAttribute("dataB",sportnews2.getAuthor());
            request.setAttribute("dataC",sportnews2.getCreated_at());
            request.setAttribute("dataD",sportnews2.getContent());

            request.setAttribute("dataQ",sportnews3.getTitle());
            request.setAttribute("dataW",sportnews3.getAuthor());
            request.setAttribute("dataE",sportnews3.getCreated_at());
            request.setAttribute("dataR",sportnews3.getContent());

            RequestDispatcher dispatcher2 = request.getRequestDispatcher("sports.jsp");
            dispatcher2.forward(request, response);

        }
        if (category.equals("科技新闻")) {
            NewsLink sciencenews1 = new NewsLink();
            NewsLink sciencenews2 = new NewsLink();
            NewsLink sciencenews3 = new NewsLink();
            ResultSet resultSet = null;
            PreparedStatement preparedStatement = null;
            Connection connection = null;
            //科技1
            try {
                connection = DBConnection.getConnection();
                String sql = "SELECT title, content, author,created_at FROM news where id=3";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery(sql);
                while (resultSet.next()) {
                    sciencenews1.setTitle(resultSet.getString("title"));
                    sciencenews1.setContent(resultSet.getString("content"));
                    sciencenews1.setAuthor(resultSet.getString("author"));
                    sciencenews1.setCreated_at(resultSet.getString("created_at"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            //科技2
            try {
                connection = DBConnection.getConnection();
                String sql = "SELECT title, content, author,created_at FROM news where id=4";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery(sql);
                while (resultSet.next()) {
                    sciencenews2.setTitle(resultSet.getString("title"));
                    sciencenews2.setContent(resultSet.getString("content"));
                    sciencenews2.setAuthor(resultSet.getString("author"));
                    sciencenews2.setCreated_at(resultSet.getString("created_at"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            //科技3
            try {
                connection = DBConnection.getConnection();
                String sql = "SELECT title, content, author,created_at FROM news where id=9";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery(sql);
                while (resultSet.next()) {
                    sciencenews3.setTitle(resultSet.getString("title"));
                    sciencenews3.setContent(resultSet.getString("content"));
                    sciencenews3.setAuthor(resultSet.getString("author"));
                    sciencenews3.setCreated_at(resultSet.getString("created_at"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            request.setAttribute("data1",sciencenews1.getTitle());
            request.setAttribute("data2",sciencenews1.getAuthor());
            request.setAttribute("data3",sciencenews1.getCreated_at());
            request.setAttribute("data4",sciencenews1.getContent());

            request.setAttribute("dataA",sciencenews2.getTitle());
            request.setAttribute("dataB",sciencenews2.getAuthor());
            request.setAttribute("dataC",sciencenews2.getCreated_at());
            request.setAttribute("dataD",sciencenews2.getContent());

            request.setAttribute("dataQ",sciencenews3.getTitle());
            request.setAttribute("dataW",sciencenews3.getAuthor());
            request.setAttribute("dataE",sciencenews3.getCreated_at());
            request.setAttribute("dataR",sciencenews3.getContent());



            RequestDispatcher dispatcher3 = request.getRequestDispatcher("science.jsp");
            dispatcher3.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
