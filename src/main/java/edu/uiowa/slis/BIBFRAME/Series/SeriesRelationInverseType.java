package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesRelationInverseIterator theSeriesRelationInverseIterator = (SeriesRelationInverseIterator)findAncestorWithClass(this, SeriesRelationInverseIterator.class);
			pageContext.getOut().print(theSeriesRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for relation tag ");
		}
		return SKIP_BODY;
	}
}

