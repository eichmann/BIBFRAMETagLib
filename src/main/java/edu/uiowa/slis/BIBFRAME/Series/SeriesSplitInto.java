package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesSplitIntoIterator theSeriesSplitIntoIterator = (SeriesSplitIntoIterator)findAncestorWithClass(this, SeriesSplitIntoIterator.class);
			pageContext.getOut().print(theSeriesSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

