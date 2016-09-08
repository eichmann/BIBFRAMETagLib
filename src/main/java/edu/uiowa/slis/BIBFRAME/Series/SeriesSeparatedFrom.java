package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesSeparatedFromIterator theSeriesSeparatedFromIterator = (SeriesSeparatedFromIterator)findAncestorWithClass(this, SeriesSeparatedFromIterator.class);
			pageContext.getOut().print(theSeriesSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

