package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesSeparatedIntoIterator theSeriesSeparatedIntoIterator = (SeriesSeparatedIntoIterator)findAncestorWithClass(this, SeriesSeparatedIntoIterator.class);
			pageContext.getOut().print(theSeriesSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

