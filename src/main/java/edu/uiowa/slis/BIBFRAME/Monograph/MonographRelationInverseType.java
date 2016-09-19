package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographRelationInverseIterator theMonographRelationInverseIterator = (MonographRelationInverseIterator)findAncestorWithClass(this, MonographRelationInverseIterator.class);
			pageContext.getOut().print(theMonographRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for relation tag ");
		}
		return SKIP_BODY;
	}
}

