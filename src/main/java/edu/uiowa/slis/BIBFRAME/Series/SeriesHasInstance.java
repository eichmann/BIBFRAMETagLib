package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasInstanceIterator theSeriesHasInstanceIterator = (SeriesHasInstanceIterator)findAncestorWithClass(this, SeriesHasInstanceIterator.class);
			pageContext.getOut().print(theSeriesHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

