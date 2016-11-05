package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesAgentInverseIterator theSeriesAgentInverseIterator = (SeriesAgentInverseIterator)findAncestorWithClass(this, SeriesAgentInverseIterator.class);
			pageContext.getOut().print(theSeriesAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for agent tag ");
		}
		return SKIP_BODY;
	}
}

