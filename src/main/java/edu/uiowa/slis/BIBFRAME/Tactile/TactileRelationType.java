package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileRelationIterator theTactileRelationIterator = (TactileRelationIterator)findAncestorWithClass(this, TactileRelationIterator.class);
			pageContext.getOut().print(theTactileRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for relation tag ");
		}
		return SKIP_BODY;
	}
}

