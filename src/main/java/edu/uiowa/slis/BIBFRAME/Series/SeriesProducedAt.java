package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesProducedAtIterator theSeriesProducedAtIterator = (SeriesProducedAtIterator)findAncestorWithClass(this, SeriesProducedAtIterator.class);
			pageContext.getOut().print(theSeriesProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

