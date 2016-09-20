package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasOtherEditionInverseIterator theSeriesHasOtherEditionInverseIterator = (SeriesHasOtherEditionInverseIterator)findAncestorWithClass(this, SeriesHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theSeriesHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

