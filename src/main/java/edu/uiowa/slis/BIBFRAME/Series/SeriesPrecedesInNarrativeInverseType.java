package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesPrecedesInNarrativeInverseIterator theSeriesPrecedesInNarrativeInverseIterator = (SeriesPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, SeriesPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theSeriesPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

