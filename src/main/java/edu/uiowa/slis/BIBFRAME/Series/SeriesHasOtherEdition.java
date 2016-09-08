package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasOtherEditionIterator theSeriesHasOtherEditionIterator = (SeriesHasOtherEditionIterator)findAncestorWithClass(this, SeriesHasOtherEditionIterator.class);
			pageContext.getOut().print(theSeriesHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

