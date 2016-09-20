package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesFollowsInNarrativeInverseIterator theSeriesFollowsInNarrativeInverseIterator = (SeriesFollowsInNarrativeInverseIterator)findAncestorWithClass(this, SeriesFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theSeriesFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

