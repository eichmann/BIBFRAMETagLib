package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesPrecedesInNarrativeIterator theSeriesPrecedesInNarrativeIterator = (SeriesPrecedesInNarrativeIterator)findAncestorWithClass(this, SeriesPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theSeriesPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

