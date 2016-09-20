package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesFollowsIterator theSeriesFollowsIterator = (SeriesFollowsIterator)findAncestorWithClass(this, SeriesFollowsIterator.class);
			pageContext.getOut().print(theSeriesFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for follows tag ");
		}
		return SKIP_BODY;
	}
}

