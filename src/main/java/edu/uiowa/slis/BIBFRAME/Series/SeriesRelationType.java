package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesRelationIterator theSeriesRelationIterator = (SeriesRelationIterator)findAncestorWithClass(this, SeriesRelationIterator.class);
			pageContext.getOut().print(theSeriesRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for relation tag ");
		}
		return SKIP_BODY;
	}
}

