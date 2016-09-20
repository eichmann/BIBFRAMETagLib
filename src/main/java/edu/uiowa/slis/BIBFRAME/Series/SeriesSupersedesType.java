package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesSupersedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesSupersedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesSupersedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesSupersedesIterator theSeriesSupersedesIterator = (SeriesSupersedesIterator)findAncestorWithClass(this, SeriesSupersedesIterator.class);
			pageContext.getOut().print(theSeriesSupersedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

