package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasOtherEditionInverseIterator theMonographHasOtherEditionInverseIterator = (MonographHasOtherEditionInverseIterator)findAncestorWithClass(this, MonographHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theMonographHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

