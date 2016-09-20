package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasAbsorbedIterator theMonographHasAbsorbedIterator = (MonographHasAbsorbedIterator)findAncestorWithClass(this, MonographHasAbsorbedIterator.class);
			pageContext.getOut().print(theMonographHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

