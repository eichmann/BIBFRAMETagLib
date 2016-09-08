package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesFollowsInNarrativeIterator theSeriesFollowsInNarrativeIterator = (SeriesFollowsInNarrativeIterator)findAncestorWithClass(this, SeriesFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theSeriesFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

