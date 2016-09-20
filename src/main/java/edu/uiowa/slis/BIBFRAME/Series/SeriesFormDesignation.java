package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesFormDesignationIterator theSeries = (SeriesFormDesignationIterator)findAncestorWithClass(this, SeriesFormDesignationIterator.class);
			pageContext.getOut().print(theSeries.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

