package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasAbsorbedIterator theMonographHasAbsorbedIterator = (MonographHasAbsorbedIterator)findAncestorWithClass(this, MonographHasAbsorbedIterator.class);
			pageContext.getOut().print(theMonographHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

