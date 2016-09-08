package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIsUnionOfIterator theSeriesIsUnionOfIterator = (SeriesIsUnionOfIterator)findAncestorWithClass(this, SeriesIsUnionOfIterator.class);
			pageContext.getOut().print(theSeriesIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

