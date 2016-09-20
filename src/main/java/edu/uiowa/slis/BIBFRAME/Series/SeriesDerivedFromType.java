package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesDerivedFromIterator theSeriesDerivedFromIterator = (SeriesDerivedFromIterator)findAncestorWithClass(this, SeriesDerivedFromIterator.class);
			pageContext.getOut().print(theSeriesDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

