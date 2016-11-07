package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasOriginalVersionIterator theSeriesHasOriginalVersionIterator = (SeriesHasOriginalVersionIterator)findAncestorWithClass(this, SeriesHasOriginalVersionIterator.class);
			pageContext.getOut().print(theSeriesHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}
