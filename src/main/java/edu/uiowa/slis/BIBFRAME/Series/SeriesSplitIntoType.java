package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesSplitIntoIterator theSeriesSplitIntoIterator = (SeriesSplitIntoIterator)findAncestorWithClass(this, SeriesSplitIntoIterator.class);
			pageContext.getOut().print(theSeriesSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for splitInto tag ");
		}
		return SKIP_BODY;
	}
}
