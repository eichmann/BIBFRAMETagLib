package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntityLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntityLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntityLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TemporalEntity theTemporalEntity = (TemporalEntity)findAncestorWithClass(this, TemporalEntity.class);
			if (!theTemporalEntity.commitNeeded) {
				pageContext.getOut().print(theTemporalEntity.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			TemporalEntity theTemporalEntity = (TemporalEntity)findAncestorWithClass(this, TemporalEntity.class);
			return theTemporalEntity.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing TemporalEntity for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			TemporalEntity theTemporalEntity = (TemporalEntity)findAncestorWithClass(this, TemporalEntity.class);
			theTemporalEntity.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for label tag ");
		}
	}
}

